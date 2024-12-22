// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelicicle_dagger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "icicle_dagger"), "main");
	private final ModelPart bone2;
	private final ModelPart bone;

	public Modelicicle_dagger(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 21.136F, -0.0858F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition bone = bone2.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(26, 19)
						.addBox(-0.5F, 5.5F, -6.6923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-0.5F, 2.5F, -5.6923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, 1.5F, -4.6923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-0.5F, 0.5F, -3.6923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-0.5F, -0.5F, -2.6923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-0.5F, -1.5F, -1.6923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(-0.5F, -2.5F, -0.6923F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 20)
						.addBox(-0.5F, -3.5F, 0.3077F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-0.5F, -4.5F, 1.3077F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.5F, -5.5F, 2.3077F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 26)
						.addBox(-0.5F, -6.5F, 3.3077F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 26)
						.addBox(-0.5F, 3.5F, -5.6923F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 14)
						.addBox(-0.5F, 4.5F, -6.6923F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}