package io.abdul.final_keyword.synthetic_constructs.bridge_methods;

import java.util.Comparator;

public class BridgeMethodDemo implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}