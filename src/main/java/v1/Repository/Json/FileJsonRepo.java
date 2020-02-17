package v1.Repository.Json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import v1.models.Application;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FileJsonRepo implements FileJsonRepository {
    @Override
    public List<Application> getFile() {
        try{
            Type appListType = new TypeToken<List<Application>>() {
            }.getType();
            List<Application> appList = new Gson().fromJson(new FileReader("D:\\ErrorNotifierApp\\src\\main\\java\\v2\\log\\ConfigFile"), appListType);
            return appList;
        }
        catch(IOException e){
            e.printStackTrace(); //TODO: CHANGE THIS!
        }
        return null;
    }
}
