/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.apiman.dt.ui.client.local.pages.error;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.overlord.apiman.dt.api.rest.contract.exceptions.AbstractRestException;

import com.google.gwt.user.client.ui.TextBox;


/**
 * Page is displayed when a 404 error is received during page load.
 *
 * @author eric.wittmann@redhat.com
 */
@Templated("/org/overlord/apiman/dt/ui/client/local/site/error-500.html#error-page")
@Dependent
public class Error500Page extends AbstractErrorPage {
    
    @Inject @DataField
    TextBox errorMessage;
    
    /**
     * Constructor.
     */
    public Error500Page() {
    }
    
    /**
     * @see org.overlord.apiman.dt.ui.client.local.pages.error.AbstractErrorPage#setValue(org.overlord.apiman.dt.api.rest.contract.exceptions.rest.contract.exceptions.AbstractRestException, boolean)
     */
    @Override
    public void setValue(AbstractRestException value, boolean fireEvents) {
        super.setValue(value, fireEvents);
        errorMessage.setValue(value.getMessage());
    }
    
}
