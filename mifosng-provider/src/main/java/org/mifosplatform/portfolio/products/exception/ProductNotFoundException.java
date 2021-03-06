/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.products.exception;

import org.mifosplatform.infrastructure.core.exception.AbstractPlatformResourceNotFoundException;

/**
 * A {@link RuntimeException} thrown when loan product resources are not found.
 */
public class ProductNotFoundException extends AbstractPlatformResourceNotFoundException {

    public ProductNotFoundException(final Long id, String type) {
        super("error.msg.product.id.invalid", type + " product with identifier " + id + " does not exist" , id);
    }
}