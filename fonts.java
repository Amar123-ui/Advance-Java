package com.company;

import java.awt.GraphicsEnvironment;
class Font
    {
        public static void main(String[] args){

            GraphicsEnvironment local_env;
            local_env= GraphicsEnvironment.getLocalGraphicsEnvironment();

            String allfonts[] = local_env.getAvailableFontFamilyNames();

            for(int i=0;i<allfonts.length;i++)
                System.out.println(allfonts[i]);
        }

    }
