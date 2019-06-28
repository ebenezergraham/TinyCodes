package me.ebenezergraham.tinycode.java;


import java.util.ArrayList;
import java.util.*;

public class LatestStudent {
	
	
	public LatestStudent() {
	}
	
	public Map<String, Integer> latestStudent(List<List<String>> attendance) {
		
		
		Map<String, Map<String, Integer>> students = new TreeMap<>();
		Map<String, Integer> output = new LinkedHashMap<>();
		
		for (List<String> record : attendance) {
			int lateness = Integer.valueOf(record.get(3)) - Integer.valueOf(record.get(2));
			Map details = new HashMap<String, Integer>();
			details.put(record.get(1), lateness);
			students.put(record.get(0), details);
		}
		
		students.forEach((entry, studentDetail) -> {
			for (Map.Entry<String, Integer> record : studentDetail.entrySet()) {
				int latestStudentValue = 0;
				
				if (record.getValue() > latestStudentValue) {
					output.put(record.getKey(), record.getValue());
					latestStudentValue = Integer.valueOf(record.getValue());
				}
			}
		});
		
		return output;
	}
}
