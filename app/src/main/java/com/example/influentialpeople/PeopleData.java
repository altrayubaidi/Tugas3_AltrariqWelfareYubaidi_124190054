package com.example.influentialpeople;

import java.util.ArrayList;

public class PeopleData {
    private static String[] title = new String[]{"Albert Einstein","Martin Luther King Jr.",
            "Isaac Newton","Abraham Lincoln"};
    private static int[] thumbnail = new
            int[]{R.drawable.albert,R.drawable.mlk, R.drawable.isaac,
            R.drawable.abraham};
    public static ArrayList<PeopleModel> getListData(){
        PeopleModel peopleModel = null;
        ArrayList<PeopleModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            peopleModel = new PeopleModel();
            peopleModel.setPersonPhoto(thumbnail[i]);
            peopleModel.setPersonName(title[i]);
            list.add(peopleModel);
        }
        return list;
    }
}
