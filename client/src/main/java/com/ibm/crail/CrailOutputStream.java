/*
 * Crail: A Multi-tiered Distributed Direct Access File System
 *
 * Author: Patrick Stuedi <stu@zurich.ibm.com>
 *
 * Copyright (C) 2016, IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ibm.crail;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;

public interface CrailOutputStream {
	public Future<CrailResult> write(CrailBuffer dataBuf) throws Exception;
	public Future<Void> sync() throws IOException;
	public long position();
	public long getWriteHint();
	public void close() throws Exception;
}
