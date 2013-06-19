package loon.utils.xml;

/**
 * Copyright 2008 - 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @project loon
 * @author cping
 * @email：javachenpeng@yahoo.com
 * @version 0.1
 */
public interface XMLListener {

	public void addHeader(int line, XMLProcessing xp);

	public void addComment(int line, XMLComment c);

	public void addData(int line, XMLData data);

	public void addAttribute(int line, XMLAttribute a);

	public void addElement(int line, XMLElement e);

	public void endElement(int line, XMLElement e);
}
