/*
 *  This file is part of the Wayback archival access software
 *   (http://archive-access.sourceforge.net/projects/wayback/).
 *
 *  Licensed to the Internet Archive (IA) by one or more individual 
 *  contributors. 
 *
 *  The IA licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.archive.wayback.resourceindex.filters;

import org.archive.wayback.core.CaptureSearchResult;
import org.archive.wayback.resourceindex.filterfactory.ExclusionCaptureFilterGroup;
import org.archive.wayback.util.ObjectFilter;

/**
 * @author brad
 *
 */
public abstract class ExclusionFilter implements ObjectFilter<CaptureSearchResult> {
	protected ExclusionCaptureFilterGroup filterGroup;
	public void setFilterGroup(ExclusionCaptureFilterGroup filterGroup) {
		this.filterGroup = filterGroup;
	}
}
