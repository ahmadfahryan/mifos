/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.self.account.service;

import java.util.Collection;

import org.mifosplatform.portfolio.self.account.data.SelfAccountTemplateData;
import org.mifosplatform.useradministration.domain.AppUser;

public interface SelfAccountTransferReadService {

	Collection<SelfAccountTemplateData> retrieveSelfAccountTemplateData(
			AppUser user);

}
