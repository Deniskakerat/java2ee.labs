package ua.edu.sumdu;

public class Student {
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String group;
    private String faculty;
    
    public Student(String firstName, String lastName,
    String age, String email, String group, String faculty) throws IllegalArgumentException {
        if (firstName.isBlank()) {
            throw new IllegalArgumentException("1st name is empty");
        }
        if (lastName.isBlank()) {
            throw new IllegalArgumentException("Last name is empty");
        }
        if (age.isBlank()) {
            throw new IllegalArgumentException("Age is empty");
        }
        if (group.isBlank()) {
            throw new IllegalArgumentException("Group is empty");
        }
        if (faculty.isBlank()) {
            throw new IllegalArgumentException("Faculty is empty");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.group = group;
        this.faculty = faculty;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName.isBlank()) {
            throw new IllegalArgumentException("1st name is empty");
        }
        
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName.isBlank()) {
            throw new IllegalArgumentException("Last name is empty");
        }
        
        this.lastName = lastName;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) throws IllegalArgumentException {
        if (age.isBlank()) {
            throw new IllegalArgumentException("Age is empty");
        }
        
        this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getGroup() {
        return group;
    }
    
    public void setGroup(String group) throws IllegalArgumentException {
        if (group.isBlank()) {
            throw new IllegalArgumentException("Group is empty");
        }
        
        this.group = group;
    }
    
    public String getFaculty() {
        return faculty;
    }
    
    public void setFaculty(String faculty) throws IllegalArgumentException {
        if (faculty.isBlank()) {
            throw new IllegalArgumentException("Faculty is empty");
        }
        
        this.faculty = faculty;
    }
}
