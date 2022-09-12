package com.ramostear.springboot.uploadfile.service.impl.carry;


import com.ramostear.springboot.uploadfile.model.UserModel;
import com.ramostear.springboot.uploadfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service("ReadInterface")
public class Read implements ReadInterface{
    FileReader fr = null;
    BufferedReader br = null;
    File fileLo=null;
    @Autowired
    private UserService userService;



    @Override
    public void archvio(MultipartFile file)  {
        if (file.getContentType().equals("text/plain")){
            try {
                fileLo = new File("src/main/resources/targetFile.tmp");
                try (OutputStream os = new FileOutputStream(fileLo)) {
                    os.write(file.getBytes());
                }
                fr = new FileReader (fileLo);
                BufferedReader br = new BufferedReader(fr);
                String linea="";
                String[] seccion ;
                while((linea=br.readLine())!=null){
                   seccion = linea.split(",");
                   try{
                       UserModel userModel = new UserModel(Long.parseLong(seccion[0]),seccion[1],
                               seccion[2],seccion[3]);
                       userService.save(userModel);

                   }catch (Error e){
                       System.out.println(e);
                   }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Por favor verifique que sea un archivo de texto plano");
        }
    }
}
