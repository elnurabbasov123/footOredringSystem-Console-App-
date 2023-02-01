package util;

import kitchens.Kitchen;
import menyu.MainCourse;

import java.util.List;

public class MainCourseUtil {



    public static List<MainCourse> mainCourseList=List.of(new MainCourse("Bozbash","4.5$",Kitchen.Azerbaijani)
            ,new MainCourse("Borsh","3$",Kitchen.Russian)
            ,new MainCourse("AdanaKebab","13$",Kitchen.Turkish)
            ,new MainCourse("Lavujs","20$",Kitchen.Italian)
            ,new MainCourse("Levengi","8$",Kitchen.Azerbaijani));


}
