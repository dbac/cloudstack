/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cloudstack.engine.subsystem.api.storage;


import java.util.List;

import org.apache.cloudstack.engine.datacenter.entity.api.DataCenterResourceEntity.State;
import org.apache.cloudstack.engine.subsystem.api.storage.disktype.VolumeDiskType;

import com.cloud.hypervisor.Hypervisor.HypervisorType;

public interface PrimaryDataStoreInfo {
	public boolean isHypervisorSupported(HypervisorType hypervisor);
	public boolean isLocalStorageSupported();
	public boolean isVolumeDiskTypeSupported(VolumeDiskType diskType);
	public long getCapacity();
	public long getAvailableCapacity();
	public List<EndPoint> getEndPoints();
	public long getId();
	public String getUuid();
	public State getManagedState();
	public String getName();
	public String getType();
	public PrimaryDataStoreLifeCycle getLifeCycle();
	PrimaryDataStoreProvider getProvider();
}
