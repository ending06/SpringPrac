package com.techmanual.chapterthree.collection;

import com.google.common.base.Objects;

import java.util.List;
import java.util.Map;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/25<p>
// -------------------------------------------------------

public class CollectionDemo {

    private List<String> stringList;

    private List<SomeObject> objectList;

    private List<Integer> integerList;

    private Map<String, String> stringMap;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<SomeObject> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<SomeObject> objectList) {
        this.objectList = objectList;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    @Override public String toString() {
        return Objects.toStringHelper(this).add("stringList", stringList).add("objectList", objectList)
                .add("integerList", integerList).add("stringMap", stringMap).toString();
    }
}
