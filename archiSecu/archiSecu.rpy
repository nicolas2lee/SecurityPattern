I-Logix-RPY-Archive version 8.10.0 Java 6930133
{ IProject 
	- _id = GUID 865e93ba-7146-43ec-b885-98cebffb20b6;
	- _myState = 8192;
	- _name = "archiSecu";
	- _modifiedTimeWeak = 1.14.2016::11:23:25;
	- _lastID = 5;
	- _UserColors = { IRPYRawContainer 
		- size = 16;
		- value = 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 
	}
	- _defaultSubsystem = { ISubsystemHandle 
		- _m2Class = "ISubsystem";
		- _filename = "sysSCADA.sbs";
		- _subsystem = "";
		- _class = "";
		- _name = "sysSCADA";
		- _id = GUID 57f4bc9e-2a59-491f-a48c-8658415066d9;
	}
	- _component = { IHandle 
		- _m2Class = "IComponent";
		- _filename = "DefaultComponent.cmp";
		- _subsystem = "";
		- _class = "";
		- _name = "DefaultComponent";
		- _id = GUID 11e735a0-4d41-40c2-8701-0fe3631c28b4;
	}
	- Multiplicities = { IRPYRawContainer 
		- size = 4;
		- value = 
		{ IMultiplicityItem 
			- _name = "1";
			- _count = 1;
		}
		{ IMultiplicityItem 
			- _name = "*";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "0,1";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "1..*";
			- _count = -1;
		}
	}
	- Subsystems = { IRPYRawContainer 
		- size = 4;
		- value = 
		{ ISubsystem 
			- fileName = "sysSCADA";
			- _id = GUID 57f4bc9e-2a59-491f-a48c-8658415066d9;
		}
		{ IProfile 
			- fileName = "JavaDocProfile";
			- _persistAs = "$OMROOT\\Profiles\\JavaDoc\\";
			- _id = GUID 19700e28-456f-4c97-a19c-b95dcb3e9dff;
			- _isReference = 1;
		}
		{ ISubsystem 
			- fileName = "securityPattern";
			- _id = GUID 6633370d-8282-4f9c-9038-2f866ee0dbde;
		}
		{ ISubsystem 
			- fileName = "secureSCADA";
			- _id = GUID 35bc7620-61ff-4a9f-aec7-b862132fd1ab;
		}
	}
	- Diagrams = { IRPYRawContainer 
		- size = 0;
	}
	- Components = { IRPYRawContainer 
		- size = 1;
		- value = 
		{ IComponent 
			- fileName = "DefaultComponent";
			- _id = GUID 11e735a0-4d41-40c2-8701-0fe3631c28b4;
		}
	}
}

