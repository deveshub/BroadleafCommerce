/*
 * #%L
 * BroadleafCommerce Common Libraries
 * %%
 * Copyright (C) 2009 - 2014 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.common.i18n.dao;

import org.broadleafcommerce.common.i18n.domain.ISOCountry;
import java.util.List;

/**
 * @author Elbert Bautista (elbertbautista)
 */
public interface ISODao {

    public List<ISOCountry> findISOCountries();

    public ISOCountry findISOCountryByAlpha2Code(String alpha2);

    public ISOCountry save(ISOCountry isoCountry);

}