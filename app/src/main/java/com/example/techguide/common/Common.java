package com.example.techguide.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Common {

    public static final String NODE_RAW_POST = "Raw post";

    public static final String NODE_LECTURERS = "Lecturers";

    public static final String KEY = "Lecturer key";

    public static final String AGE = "Agric and Environmental Engineering";
    public static final String CHE = "Chemical Engineering";
    public static final String CVE = "Civil Engineering";
    public static final String CSC = "Computer Science and Engineering";
    public static final String FST = "Food Science and Technology";
    public static final String EEE = "Electrical and Electronics Engineering";
    public static final String MEE = "Mechanical Engineering";
    public static final String MSE = "Material Science and Engineering";
    public static final String FROM_ACTIVITY = "Lecturer Activity";
    public static final String DEPARTMENT = "Department";
    public static final String NODE_FACULTY_EXECS = "Faculty Executives";


    public static boolean isConnectedToInternet(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null){
            NetworkInfo[] infos = connectivityManager.getAllNetworkInfo();

            if (infos != null){
                for (int i = 0; i< infos.length ; i++){
                    if (infos[i].getState() == NetworkInfo.State.CONNECTED){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
