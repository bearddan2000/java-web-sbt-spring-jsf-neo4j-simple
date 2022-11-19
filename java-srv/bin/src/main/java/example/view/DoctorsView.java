package example.view;

import java.io.Serializable;
import java.util.*;

import example.model.Doctor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="DoctorsView")
@SessionScoped
public class DoctorsView implements Serializable {

  private static final long serialVersionUID = 1L;


  public static List<Doctor> getDogs() {
    return new ArrayList<Doctor>() {{
      add(new Doctor(1L, "Bill", "ER Medicine", "Cardiac"));
      add(new Doctor(2L, "Sue", "Neurology", "Spinal Disorder"));
      add(new Doctor(3L, "Jose", "Pediatrics", "General"));
    }};
  }
}
