/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.graphrbac.implementation.PasswordCredentialInner;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.io.OutputStream;

/**
 * An immutable client-side representation of an Azure AD credential.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.Graph.RBAC.Fluent")
@Beta(SinceVersion.V1_1_0)
public interface PasswordCredential extends
        Credential,
        HasInner<PasswordCredentialInner> {

    /**************************************************************
     * Fluent interfaces to attach a credential
     **************************************************************/

    /**
     * The entirety of a credential definition.
     * @param <ParentT> the return type of the final {@link Attachable#attach()}
     */
    interface Definition<ParentT> extends
            DefinitionStages.Blank<ParentT>,
            DefinitionStages.WithAttach<ParentT> {
    }

    /**
     * Grouping of credential definition stages applicable as part of a application or service principal creation.
     */
    interface DefinitionStages {
        /**
         * The first stage of a credential definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ParentT> extends WithKey<ParentT> {
        }

        /**
         * The credential definition stage allowing the the password or certificate to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithKey<ParentT> {
            /**
             * Use a password as a key.
             * @param password the password value
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withPasswordValue(String password);
        }

        /**
         * The credential definition stage allowing start date to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithStartDate<ParentT> {
            /**
             * Specifies the start date after which password or key would be valid. Default value is current time.
             * @param startDate the start date for validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withStartDate(DateTime startDate);
        }

        /**
         * The credential definition stage allowing the duration of key validity to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithDuration<ParentT> {
            /**
             * Specifies the duration for which password or key would be valid. Default value is 1 year.
             * @param duration the duration of validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withDuration(Duration duration);
        }

        /**
         * A credential definition stage allowing exporting the auth file for the service principal.
         */
        interface WithAuthFile<ParentT> {
            /**
             * Export the information of this service principal into an auth file.
             * @param outputStream the output stream to export the file
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withAuthFileToExport(OutputStream outputStream);
        }

        /** The final stage of the credential definition.
         * <p>
         * At this stage, more settings can be specified, or the credential definition can be
         * attached to the parent application / service principal definition
         * using {@link WithAttach#attach()}.
         * @param <ParentT> the return type of {@link WithAttach#attach()}
         */
        interface WithAttach<ParentT> extends
                Attachable.InDefinition<ParentT>,
                WithStartDate<ParentT>,
                WithDuration<ParentT>,
                WithAuthFile<ParentT> {
        }
    }

    /**
     * The entirety of a credential definition as part of a application or service principal update.
     * @param <ParentT> the return type of the final {@link UpdateDefinitionStages.WithAttach#attach()}
     */
    interface UpdateDefinition<ParentT> extends
            UpdateDefinitionStages.Blank<ParentT>,
            UpdateDefinitionStages.WithAttach<ParentT> {
    }

    /**
     * Grouping of credential definition stages applicable as part of a application or service principal update.
     */
    interface UpdateDefinitionStages {
        /**
         * The first stage of a credential definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ParentT> extends WithKey<ParentT> {
        }

        /**
         * The credential definition stage allowing the the password or certificate to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithKey<ParentT> {
            /**
             * Use a password as a key.
             * @param password the password value
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withPasswordValue(String password);
        }

        /**
         * The credential definition stage allowing start date to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithStartDate<ParentT> {
            /**
             * Specifies the start date after which password or key would be valid. Default value is current time.
             * @param startDate the start date for validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withStartDate(DateTime startDate);
        }

        /**
         * The credential definition stage allowing the duration of key validity to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithDuration<ParentT> {
            /**
             * Specifies the duration for which password or key would be valid. Default value is 1 year.
             * @param duration the duration of validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withDuration(Duration duration);
        }

        /**
         * A credential definition stage allowing exporting the auth file for the service principal.
         */
        interface WithAuthFile<ParentT> {
            /**
             * Export the information of this service principal into an auth file.
             * @param outputStream the output stream to export the file
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withAuthFileToExport(OutputStream outputStream);
        }

        /** The final stage of the credential definition.
         * <p>
         * At this stage, more settings can be specified, or the credential definition can be
         * attached to the parent application / service principal definition
         * using {@link WithAttach#attach()}.
         * @param <ParentT> the return type of {@link WithAttach#attach()}
         */
        interface WithAttach<ParentT> extends
                Attachable.InUpdate<ParentT>,
                WithStartDate<ParentT>,
                WithDuration<ParentT>,
                WithAuthFile<ParentT> {
        }
    }
}
