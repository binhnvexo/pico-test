/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.impl;

import java.util.ArrayList;
import java.util.List;

import org.exoplatform.MovieFinder;

/**
 * Created by The eXo Platform SAS
 * Author : BinhNV
 *          binhnv@exoplatform.com
 * Jul 3, 2012  
 */
public class MovieFinderImpl implements MovieFinder {

  /* (non-Javadoc)
   * @see org.exoplatform.MovieFinder#findAll()
   */
  @Override
  public List<String> findAll() {
    List<String> list = new ArrayList<String>();
    list.add("Spiderman");
    list.add("Italian job");
    list.add("The Fast and Furious");
    return list;
  }

}
