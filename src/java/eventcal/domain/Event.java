/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.domain;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alan
 */
public class Event implements Serializable {
	private String description;
	private String club;
	private Date finalizedDate;
	private Date dateCreated;
	private Date lastModified;

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
	 * @return the club
	 */
	public String getClub() {
		return club;
	}

	/**
	 * @param club the club to set
	 */
	public void setClub(String club) {
		this.club = club;
	}

	/**
	 * @return the finalizedDate
	 */
	public Date getFinalizedDate() {
		return finalizedDate;
	}

	/**
	 * @param finalizedDate the finalizedDate to set
	 */
	public void setFinalizedDate(Date finalizedDate) {
		this.finalizedDate = finalizedDate;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Description: " + description + ";");
		buffer.append("Club: " + club + ";");
		buffer.append("Finalized Date: "+ finalizedDate + ";");
		buffer.append("Date Created: " + dateCreated + ";");
		buffer.append("Date Modified: " + lastModified + ";");
		return buffer.toString();
	}
}
