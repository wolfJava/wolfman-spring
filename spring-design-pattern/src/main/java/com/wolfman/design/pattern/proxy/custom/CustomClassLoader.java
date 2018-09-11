package com.wolfman.design.pattern.proxy.custom;

import java.io.*;
import java.lang.reflect.Field;

public class CustomClassLoader extends ClassLoader {

    private File classPathFile;


    public CustomClassLoader(){
        String classPath = CustomClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    /**
     * 根据类名，找到本地class文件，最终写到缓存中
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = CustomClassLoader.class.getPackage().getName() + "." + name;

        if (classPathFile != null){
            //创建这个name得class文件
            File classFile = new File(classPathFile,name.replace("\\.","/") + ".class");
            if (classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                       out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if (null != in){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (null != out){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return null;
        }












        return super.findClass(name);
    }
}
