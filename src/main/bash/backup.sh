#!/bin/bash
# Todo: Add optional parameter and create man page

#openLocation=true
zipLocation=~/Desktop

# Function to output example in case of wrong usage
function usage {
        printf "USAGE:\n"
        printf "\tExample: qb path/file 1\n"
        printf "\tExample: qb path/file 1 file 2 file N\n"
}

if [ -z $@ ];
then
        usage
exit 1
fi

# Creating symbolic link to script if it doesn't exit yet
if [ ! -e ~/bin/qb ];
then
        echo Creating Symbolic Link --  qb
        $(ln -s ~/bin/backup.sh ~/bin/qb )
        usage
fi

# Ask for custom zip name. If non is provided the hostname and time is used.
read -p "Name of backup (leave blank to use hostname_date.zip): " name

if [ -z $name ];
then
        filename=$(hostname)_$(date +"%m_%d_%Y_%H_%M").zip
else
        filename=$name.zip
fi

if [ -e $zipLocation/$filename ];
then
        read -p "A backup with this name already exist. Do you want to place it? yes/no: " res
        if [ $res = "yes" ]; then
        echo Replacing older version...
                zip -r -q $filename $@
        if [ -e $filename ]; then
                mv $filename $zipLocation
                echo Backup complete...
        exit $?
        fi

        elif [ $res = "no" ]; then
                echo Aborting Operation
                exit 1;
        fi
else
        zip -r -q $filename $@
        if [ -e $filename ]; then
                mv $filename $zipLocation
                echo Backup complete...
        exit $?
        fi
fi

#if [ $openLocation ];
#then
#        $(xdg-open $zipLocation)
#        exit 0
#fi
