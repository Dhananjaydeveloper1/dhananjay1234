package com.collectionAssingment;
//Create a program to store the names of states of India in a LinkedHashSet named stateSet by reading the file. 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//6

public class States {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("D:/io/States.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Set<String> stateSet = new LinkedHashSet<String>();
		try {
			String reader = bufferedReader.readLine();// travering data
			while (reader != null) {
				stateSet.add(reader);
				reader = bufferedReader.readLine();
			}
			System.out.println("Total number of state:" + stateSet.size());
			System.out.println("Removing state delhi:" + stateSet.remove("Delhi"));
			System.out.println("After removing the Delhi:" + stateSet);
			System.out.println("State which starts with k:");
			for (String state : stateSet) {
				if (state.charAt(0) == 'k' || state.charAt(0) == 'k') {
					System.out.println(state + " ");
				}
			}
			List<String> stateList = new ArrayList<String>(stateSet);// sorting the state
			Collections.sort(stateList);
			Set<String> statesort = new LinkedHashSet<>(stateList);
			System.out.println("\nStates in sorted order: " + statesort);

		} finally {
			try {
			bufferedReader.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}}
}}