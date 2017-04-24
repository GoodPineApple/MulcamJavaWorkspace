package com.poby.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Test
public class TMAlgo2 {

	@Test
	public void TMSortTest() throws ParseException {
		String inputJSON = "[{\"GROUP\":[\"Potal\",2],\"URL\":\"http://www.naver.com\"},{\"GROUP\":[\"Trash\",1],\"URL\":\"http://www.google.com\"},{\"GROUP\":[\"None\",1],\"URL\":\"http://www.daum.net\"},{\"GROUP\":[\"Potal\",1],\"URL\":\"http://www.nate.com\"}]";
		
		Gson gson = new Gson();
		// string parsing
		List<GroupVO> list = gson.fromJson(inputJSON, new TypeToken<List<GroupVO>>(){}.getType());
		// sorting
		Collections.sort(list);
		
		// grouping
		HashMap<String, List<GroupVO>> listGroupMap = new HashMap<String, List<GroupVO>>();
		for (GroupVO groupVO : list) {
			String key = groupVO.getGroupList().get(0);
			List<GroupVO> tempGroupList;			
			if (listGroupMap.containsKey(key)) {
				tempGroupList = listGroupMap.get(key);
			} else {
				tempGroupList = new ArrayList<GroupVO>();
			}
			tempGroupList.add(groupVO);
			listGroupMap.put(key, tempGroupList);
		}
		
		List<List<GroupVO>> listGroupVOList = new ArrayList<List<GroupVO>>();
		for (String mapKey : listGroupMap.keySet()) {
			listGroupVOList.add(listGroupMap.get(mapKey));
		}
		
		System.out.println(gson.toJson(listGroupVOList));

	}

}
