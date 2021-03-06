/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package HSL;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService
@XmlSeeAlso({HSL.types.ObjectFactory.class})
public interface Person {

    @RequestWrapper(localName = "GetPerson", className = "HSL.types.GetPerson")
    @ResponseWrapper(localName = "GetPersonResponse", className = "HSL.types.GetPersonResponse")
    @WebMethod(operationName = "GetPerson")
    public void getPerson(
        @WebParam(mode = WebParam.Mode.INOUT, name = "personId")
        javax.xml.ws.Holder<java.lang.String> personId,
        @WebParam(mode = WebParam.Mode.OUT, name = "ssn")
        javax.xml.ws.Holder<java.lang.String> ssn,
        @WebParam(mode = WebParam.Mode.OUT, name = "name")
        javax.xml.ws.Holder<java.lang.String> name
    ) throws UnknownPersonFault;
}
