/*
Copyright (c) 2016, Aziz Nanthaamornphong and Anawat Leathongkum

Redistribution and use in source and binary forms, with or without modification, are 
permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of 
conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of 
conditions and the following disclaimer in the documentation and/or other materials 
provided with the distribution.

3. Neither the names of the copyright holders nor the names of its contributors may be 
used to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY 
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES 
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY 
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package edu.ua.node;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public class StereotypeNode extends UMLNode {

  private List node = new ArrayList();
  private String name = "";
  private String id = "";

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void addNodes(UMLNode n) {
    node.add(n);
  }

  @Override
  public String getName() {
    return "UML:Stereotype";
  }

  public void setName(String name){
      this.name = name;
  }
  
  @Override
  public List getChildren() {
    return node;
  }

  @Override
  public int getChildCount() {
    return node.size();
  }

  @Override
  public Attributes getAttributes() {
    AttributesImpl attributes = new AttributesImpl();
    attributes.addAttribute("", "xmi.id", "", "", this.id);
    attributes.addAttribute("", "name", "", "", this.name);
    attributes.addAttribute("", "isSpecification", "", "", "false");
    attributes.addAttribute("", "isRoot", "", "", "false");
    attributes.addAttribute("", "isLeaf", "", "", "false");
    attributes.addAttribute("", "isAbstract", "", "", "false");
    return attributes;
  }
}
