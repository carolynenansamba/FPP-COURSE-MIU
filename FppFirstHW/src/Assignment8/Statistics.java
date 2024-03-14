package Assignment8;

import java.util.*;
    public class Statistics {

        public static double computeSumOfSalaries(List<EmployeeData>/*<implement>*/ aList) {
            double sum = 0.0;
            for(int i=0; i<aList.size(); i++){
                sum = sum + aList.get(i).getSalary();
            }
            return sum;

        }
    }

