package com.zhomans.linked;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zach on 10/14/13.
 */

public class Group {

    public String string;
    public int icon;
    public final List<Child> children = new ArrayList<Child>();

    public Group(String string, int icon) {
        this.string = string;
        this.icon = icon;
    }

}