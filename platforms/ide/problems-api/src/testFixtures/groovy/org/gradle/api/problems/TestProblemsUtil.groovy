/*
 * Copyright 2023 the original author or authors.
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

package org.gradle.api.problems

import org.gradle.api.problems.internal.DefaultProblems
import org.gradle.api.problems.internal.InternalProblems
import org.gradle.api.problems.internal.NoOpProblemEmitter

/**
 * Static util class that provides methods for creating {@link Problems} instances for testing.
 */
abstract class TestProblemsUtil {
    private TestProblemsUtil() { /* not instantiable */ }

    /**
     * Creates a new {@link Problems} instance that does not report problems as build operation events.
     *
     * @return the problems instance
     */
    public static InternalProblems createTestProblems() {
       return new DefaultProblems(new NoOpProblemEmitter())
    }
}
