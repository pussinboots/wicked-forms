/**
 *   Copyright 2013 Wicked Forms (https://github.com/thombergs/wicked-forms)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.wickedsource.wickedforms.model.elements.fields;

import org.wickedsource.wickedforms.model.binding.Binding;

import java.util.List;

/**
 * A group of checkboxes that belong together. A checkbox group is bound to a
 * list of objects since more than one checkbox may be marked by a user.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 * @param <T>
 *          the type of object that is each represented by one checkbox
 */
public class CheckboxGroupModel<T> extends
    AbstractMultiChoiceModel<T> {

	public CheckboxGroupModel(final String label, final List<T> choices) {
		super(label, choices);
	}

	/**
	 * @see AbstractMultiChoiceModel#MultiChoice(String, List)
	 */
	public CheckboxGroupModel(final String label, final List<T> choices, final ChoiceLabeller<T> choiceLabeller) {
		super(label, choices, choiceLabeller);
	}

	/**
	 * @see AbstractMultiChoiceModel#MultiChoice(String, List, List)
	 */
	public CheckboxGroupModel(final String label, final List<T> choices, final ChoiceLabeller<T> choiceLabeller,
	    final List<T> value) {
		super(label, choices, choiceLabeller, value);
	}

	/**
	 * @see AbstractMultiChoiceModel#MultiChoice(String, List, Binding)
	 */
	public CheckboxGroupModel(final String label, final List<T> choices, final ChoiceLabeller<T> choiceLabeller,
	    final Binding<List<T>> binding) {
		super(label, choices, choiceLabeller, binding);
	}

	public CheckboxGroupModel(final List<T> choices, final ChoiceLabeller<T> choiceLabeller) {
		super(choices, choiceLabeller);
	}

}
