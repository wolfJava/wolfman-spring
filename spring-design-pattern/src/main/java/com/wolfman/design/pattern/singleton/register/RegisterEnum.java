package com.wolfman.design.pattern.singleton.register;

public enum RegisterEnum {

    RED(){
        private Object object = new POJO();
    },BLACK(){
        private Object object = new POJO();
    },WHITE(){
        private Object object = new POJO();
    };

    public void getInstance(){



    }

}
