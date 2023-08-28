package entity;

import java.sql.Date;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import entity.embeded.StudentName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentEntity {

    @Id
    @Column(name = "Stu_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
@Column(name = "NIC",nullable = false)

private String nic;

private StudentName name;


@ElementCollection
@CollectionTable(

name = "Student_Mobiles",
joinColumns = @JoinColumn(name = "Stu_ID")

)
private List <String> mobiles;

@CreationTimestamp
@Column(name = "Create_Date",nullable = false)
private Date creDate;

}
