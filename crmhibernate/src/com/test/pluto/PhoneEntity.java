package com.test.pluto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "phone", schema = "income", catalog = "")
public class PhoneEntity {
    private int id;
    private int number;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntity that = (PhoneEntity) o;
        return id == that.id &&
                number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }
}
