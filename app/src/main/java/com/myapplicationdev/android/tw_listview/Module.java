package com.myapplicationdev.android.tw_listview;

public class Module {
        private String module;
        private boolean moduleImg;
        public Module(String module, boolean moduleImg) {
            this.module = module;
            this.moduleImg = moduleImg;
        }
        public String getName() {
            return module;
        }
        public boolean isModuleImg () {
            return moduleImg;
        }
    }


