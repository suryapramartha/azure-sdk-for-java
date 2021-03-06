/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeCredentials;
import rx.Completable;

class IntegrationRuntimeCredentialsImpl extends WrapperImpl<IntegrationRuntimeCredentialsInner> implements IntegrationRuntimeCredentials {
    private final SynapseManager manager;

    IntegrationRuntimeCredentialsImpl(SynapseManager manager) {
        super(manager.inner().integrationRuntimeCredentials());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Completable syncAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeCredentialsInner client = this.inner();
        return client.syncAsync(resourceGroupName, workspaceName, integrationRuntimeName).toCompletable();
    }

}
