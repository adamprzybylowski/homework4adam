package com.infoshareacademy.homeworks;

import java.util.*;

public class GradeService {

    public String[][] calculateAverage(String[][] data) {
        return (data == null || data.length == 0) ? new String[][]{,} :
                Arrays.stream(data)
                        .toArray(String[][]::new);

    }
}


