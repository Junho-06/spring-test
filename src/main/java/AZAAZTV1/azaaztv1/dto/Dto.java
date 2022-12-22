package AZAAZTV1.azaaztv1.dto;

import AZAAZTV1.azaaztv1.entitiy.Dbentity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Dto {
    private String ID;
    private int PASSWORD;
    private String NAME;
    private String CLASS;



    public Dto(Dbentity dbentity) {
    this.ID= dbentity.getID();
    this.PASSWORD= dbentity.getPASSWORD();
    this.NAME= dbentity.getNAME();
    this.CLASS= dbentity.getCLASS();
    }

}
