package org.example.motorola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
    public int solution(String[] A) {
        int cardiologyCount = 0;
        int neurologyCount = 0;
        int orthopaedicsCount = 0;
        int gynaecologyCount = 0;
        int oncologyCount = 0;
        for (int i = 0; i < A.length; i++) {
            switch (A[i]) {
                case "Cardiology":
                    cardiologyCount++;
                    break;
                case "Neurology":
                    neurologyCount++;
                    break;
                case "Orthopaedics":
                    orthopaedicsCount++;
                    break;
                case "Gynaecology":
                    gynaecologyCount++;
                    break;
                case "Oncology":
                    oncologyCount++;
                    break;
            }
        }
        List<Integer> patients = new ArrayList<>();
        patients.add(cardiologyCount);
        patients.add(neurologyCount);
        patients.add(orthopaedicsCount);
        patients.add(gynaecologyCount);
        patients.add(oncologyCount);
        return Collections.max(patients);
    }
}
