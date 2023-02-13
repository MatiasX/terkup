/*
* File: Cone.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I-1 N
* Date: 2023-02-13
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
public class Cone{
    double calcVolume(double radius, double height){
        double volume=(1.0/3.0)*Math.pow(radius,2)*Math.PI*height;

        return volume;    
    }
    
}
