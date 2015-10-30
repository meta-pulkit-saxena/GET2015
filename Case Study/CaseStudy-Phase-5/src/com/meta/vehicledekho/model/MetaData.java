
/**
 * @class  MetaData
 * @author Pulkit
 * @since  25th October 15
 * This class defines all the metadata to be added.
 */

package com.meta.vehicledekho.model;

import java.util.Date;

import lombok.Data;

@Data
public class MetaData {
	private String createdBy;
	private Date creationTime;
}
