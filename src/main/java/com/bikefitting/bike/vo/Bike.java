package com.bikefitting.bike.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "BIKE")
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BIKE_ID")
    private int bikeId;

    @Column(name = "BIKE_NAME", nullable = false)
    private String bikeName;

    @Column(name = "BIKE_BRAND", nullable = false)
    private String bikeBrand;

    @Column(name = "BIKE_SIZE")
    private int bikeSize;

    @Lob
    @Column(name = "BIKE_PIC", length = 5000)
    private byte[] bikePic;

    // Constructors, getters, setters, and other methods...

    public Bike(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString() {
        return "BikeVO{" +
                "bikeId=" + bikeId +
                ", bikeName='" + bikeName + '\'' +
                ", bikeBrand='" + bikeBrand + '\'' +
                ", bikeSize=" + bikeSize +
                '}';
    }
    public String getBikeName() {
        return bikeName;
    }
	public int getBikeSize() {
		// TODO Auto-generated method stub
		return this.bikeSize;
	}
}
