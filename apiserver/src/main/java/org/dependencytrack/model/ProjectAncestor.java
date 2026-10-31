/*
 * This file is part of Dependency-Track.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) OWASP Foundation. All Rights Reserved.
 */
package org.dependencytrack.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.UUID;

/**
 * Value object describing an ancestor of a project in the project hierarchy.
 *
 * @since 5.3.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "An ancestor of a project in the project hierarchy")
public record ProjectAncestor(
        @Schema(description = "UUID of the ancestor project", requiredMode = Schema.RequiredMode.REQUIRED)
        UUID uuid,

        @Schema(description = "Name of the ancestor project", requiredMode = Schema.RequiredMode.REQUIRED)
        String name,

        @Schema(description = "Version of the ancestor project")
        String version)
        implements Serializable {}
