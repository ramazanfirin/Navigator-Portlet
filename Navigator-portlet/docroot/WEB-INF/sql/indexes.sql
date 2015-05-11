create index IX_71132316 on Order (organizationId);
create index IX_CAAE6F63 on Order (vehicleId);

create index IX_44BF572F on Poi (name);
create index IX_CF241CD1 on Poi (name, organizationId);
create index IX_79997F12 on Poi (organizationId);

create index IX_A13BB774 on Vehicle (organizationId);
create index IX_AEEC77D6 on Vehicle (plate, organizationId);

create index IX_10D0C8DD on brach (name, organizationId);

create index IX_E2E59A58 on device (imei);
create index IX_C198EDFA on device (imei, organizationId);
create index IX_5A1B303E on device (organizationId);

create index IX_89B6C712 on mobilekipyonetim_Device (entityId);

create index IX_92D1E820 on mobilekipyonetim_Vehicle (entityId);
create index IX_23E3D64C on mobilekipyonetim_Vehicle (vehicleEntityId);

create index IX_1BF30AF2 on mobilekipyonetim_device (entityId);
create index IX_624F433A on mobilekipyonetim_device (vehicleEntityId);