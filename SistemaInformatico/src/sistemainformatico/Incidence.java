/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainformatico;

/**
 *
 * @author aitor.martinezparente
 */
public class Incidence {

    private int id;
    private String description;
    private String computer;
    private String resolution;
    private int status;
    public final static int STATUS_UNSOLVED = 0;
    public final static int STATUS_PENDING = 1;
    public final static int STATUS_SOLVED = 2;
    private User sender;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the computer
     */
    public String getComputer() {
        return computer;
    }

    /**
     * @param computer the computer to set
     */
    public void setComputer(String computer) {
        this.computer = computer;
    }

    /**
     * @return the resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the STATUS_UNSOLVED
     */
    public static int getSTATUS_UNSOLVED() {
        return STATUS_UNSOLVED;
    }

    /**
     * @return the STATUS_PENDING
     */
    public static int getSTATUS_PENDING() {
        return STATUS_PENDING;
    }

    /**
     * @return the STATUS_SOLVED
     */
    public static int getSTATUS_SOLVED() {
        return STATUS_SOLVED;
    }

    /**
     * @return the sender
     */
    public User getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

    public Incidence(int id, String description, String computer, String resolution, int status, User sender) {
        this.id = id;
        this.description = description;
        this.computer = computer;
        this.resolution = resolution;
        this.status = status;
        this.sender = sender;
    }

}
