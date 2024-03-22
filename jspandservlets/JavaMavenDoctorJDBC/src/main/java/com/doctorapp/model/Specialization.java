package com.doctorapp.model;

public enum Specialization {
    ORTHO("ORTHOPEDIC"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST"),
    ENDO("ENDOCRINOLOGIST"),
    CARDIO("CARDIOLOGIST"),
    OPHTHA("OPHTHALMOLOGIST");
  
    private String speciality;
    Specialization(String speciality) {
     this.speciality = speciality;
    }
  
    public String getSpeciality() {
      return speciality;
    }
  }