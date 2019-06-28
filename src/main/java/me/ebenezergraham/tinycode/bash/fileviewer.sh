#!/usr/bin/env bash
echo $OPTIND optind
main(){
	if [[ -d $1 ]]; then
		handle_dirs $1
	elif [[ ! -f $1 && -r $1 ]]; then
		read_file $1
	fi
echo Goodbye $(whoami)
}

handle_dirs(){
	for f in $1/*; do
		file $f
		read -p "Do you want to open $f:  " res
		case $res in 
			n)
			echo Skipped $f
			;;
			Y | *)
			read_file $f
			;;
		esac
	done
}

read_file(){
	while read line; do
		echo $line
	done < $1
}

usage(){
	echo "USAGE: script [ -f | h ]" 
}

while getopts 'f:h' c
do
	case $c in
		f)
			read_file $OPTARG
		;;
		h)
			usage
		;;
	esac
done

main $1
