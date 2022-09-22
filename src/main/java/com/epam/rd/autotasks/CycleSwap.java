package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {

        if (array != null || array.length > 1) {
            if (array != null && array.length > 2) {
                int length = array.length;
                int[] changed = new int[length];

                for (int i = 0, j = 1; j < length; i++, j++) {
                    changed[j] = array[i];
                }

                changed[0] = array[length - 1];

                for(int i = 0; i < length; i++){
                    array[i] = changed[i];
                }
            }
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array != null || array.length > 1) {
            int length = array.length;
            int[] changed = new int[length];
            if(shift >= length) {
                int index = 0;
                for (int i = 0; i < length; i++) {
                    index = (shift - (length - i)) % length;
                    changed[index] = array[i];
                }
            }
            else {
                for(int i = 0, j = shift; j < length; i++, j++){
                    changed[j] = array[i];
                }

                for(int i = shift-1, j = length - 1; i >= 0; i--, j--){
                    changed[i] = array[j];
                }
            }
            for(int i = 0; i < length; i++){
                array[i] = changed[i];
            }
        }
        }
        }

