package AZAAZTV1.azaaztv1.service;

import AZAAZTV1.azaaztv1.dto.Dto;

public interface Dbservice {

    Dto saveInfo(String ID, int PASSWORD, String NAME, String CLASS); //db에 저장
   // Dto getInfo() //조회 (찾을 수 있는 기능!) 그럼 사실 필요없ㅇ..
}
