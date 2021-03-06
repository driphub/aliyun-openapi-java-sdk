/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteMerchantsRequest extends RpcAcsRequest<DeleteMerchantsResponse> {
	   

	private List<Long> merchantIds;
	public DeleteMerchantsRequest() {
		super("digitalstore", "2020-01-07", "DeleteMerchants", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getMerchantIds() {
		return this.merchantIds;
	}

	public void setMerchantIds(List<Long> merchantIds) {
		this.merchantIds = merchantIds;	
		if (merchantIds != null) {
			for (int i = 0; i < merchantIds.size(); i++) {
				putBodyParameter("MerchantId." + (i + 1) , merchantIds.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteMerchantsResponse> getResponseClass() {
		return DeleteMerchantsResponse.class;
	}

}
