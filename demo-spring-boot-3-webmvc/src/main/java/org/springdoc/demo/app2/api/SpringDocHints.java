/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  * Copyright 2019-2022 the original author or authors.
 *  *  *  *  *
 *  *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  *  * You may obtain a copy of the License at
 *  *  *  *  *
 *  *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *  *
 *  *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  *  * See the License for the specific language governing permissions and
 *  *  *  *  * limitations under the License.
 *  *  *  *
 *  *  *
 *  *
 *
 */

package org.springdoc.demo.app2.api;

import org.apache.commons.lang3.reflect.FieldUtils;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.core.MethodParameter;

/**
 * The type Spring doc hints.
 * @author bnasslahsen
 */
public class SpringDocHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
		hints.reflection().registerType(org.springdoc.core.annotations.ParameterObject.class,
				hint -> hint.withMembers(
						MemberCategory.DECLARED_FIELDS,
						MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
						MemberCategory.INVOKE_DECLARED_METHODS
				));
		hints.reflection().registerType(org.springdoc.core.converters.models.Pageable.class,
				hint -> hint.withMembers(
						MemberCategory.DECLARED_FIELDS,
						MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
						MemberCategory.INVOKE_DECLARED_METHODS
				));
		hints.reflection().registerType(org.springdoc.core.extractor.DelegatingMethodParameter.class,
				hint -> hint.withMembers(
						MemberCategory.DECLARED_FIELDS,
						MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
						MemberCategory.INVOKE_DECLARED_METHODS
				));

		hints.reflection().registerType(org.springframework.core.MethodParameter.class,
				hint -> hint.withMembers(
						MemberCategory.DECLARED_FIELDS,
						MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
						MemberCategory.INVOKE_DECLARED_METHODS
				));
		
	}

}

