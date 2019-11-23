/*
 * Copyright 2016-2019 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.bee.osql.exception;

import org.teasoft.bee.osql.BeeException;

/**
 * @author Kingstar
 * @since  1.5
 */
public class BeeIllegalParameterException extends BeeException {
	
	static final long serialVersionUID = -875516993124221121L;


	public BeeIllegalParameterException() {
		super();
	}

	public BeeIllegalParameterException(String message) {
		super(message);
	}

	public BeeIllegalParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	public BeeIllegalParameterException(Throwable cause) {
		super(cause);
	}


}

