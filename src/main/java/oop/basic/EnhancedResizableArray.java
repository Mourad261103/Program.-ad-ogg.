package oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {

    static final int DEFAUL_CAPACITY=4;
    int[] v;
    public EnhancedResizableArray() {
        this.v = new int[DEFAUL_CAPACITY];
    }
    public int get(int index)
    {
        return v[index];
    }
    public void set(int index, int value)
    {
        if(index>=v.length)
        {
            int[] news=new int[index*2];
            System.arraycopy(v,0,news,0,v.length);
            news[index]=value;
            v=news;
        }
        else {v[index]=value;}
    }
    public boolean contains(int value) {
        for (int i : v) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public void fill(int value)
    {
        for (int i = 0; i < v.length; i++)
        {
            v[i]=value;
        }

    }

    public int length()
    {
        return v.length;
    }

    public int[] toArray()
    {
        return v;
    }


}
